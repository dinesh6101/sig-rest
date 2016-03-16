package com.sig.team.webworks.ekirana.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sig.team.webworks.ekirana.constants.ApplicationConstants;
import com.sig.team.webworks.ekirana.constants.ExceptionMessages;
import com.sig.team.webworks.ekirana.crud.entity.Brand;
import com.sig.team.webworks.ekirana.crud.entity.GroceryCategory;
import com.sig.team.webworks.ekirana.crud.entity.Image;
import com.sig.team.webworks.ekirana.crud.entity.ItemCategory;
import com.sig.team.webworks.ekirana.crud.entity.Items;
import com.sig.team.webworks.ekirana.crud.repository.BrandRepository;
import com.sig.team.webworks.ekirana.crud.repository.GroceryCategoryRepository;
import com.sig.team.webworks.ekirana.crud.repository.ImageRepository;
import com.sig.team.webworks.ekirana.crud.repository.ItemCategoryRepository;
import com.sig.team.webworks.ekirana.crud.repository.ItemsRepository;
import com.sig.team.webworks.ekirana.model.CustomersOrder;
import com.sig.team.webworks.ekirana.model.ItemCategoryId;
import com.sig.team.webworks.ekirana.model.ItemsInfo;
import com.sig.team.webworks.ekirana.model.ItemsWithImage;
import com.sig.team.webworks.ekirana.service.ItemService;
import com.sig.team.webworks.rest.exception.RestException;
import com.sig.team.webworks.rest.exception.RestServiceException;

@RestController
public class ItemController {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(ItemController.class);

	@Resource
	private ImageRepository imageRepository;

	@Resource
	private ItemsRepository itemsRepository;

	@Resource
	private ItemService itemService;

	@Resource
	private GroceryCategoryRepository groceryCategoryRepository;

	@Resource
	private ItemCategoryRepository itemCategoryRepository;

	@Resource
	private BrandRepository brandRepository;

	@RequestMapping(value = "/distinctUnit", method = RequestMethod.GET)
	public @ResponseBody List<String> distinctUnit() throws RestException {
		return itemService.getDistinctUnit();
	}

	
	@RequestMapping(value = "/itemImageUpload", method = RequestMethod.POST)
	public @ResponseBody Image itemImageUpload(MultipartFile file,
			HttpServletRequest request) throws RestException {
		Image image = new Image();
		image.setName(new Date().getTime() + "_" + file.getOriginalFilename());
		image.setPath(ApplicationConstants.ITEM_IMAGE_PATH);

		try {
			File directory = new File(image.getPath());
			if (!directory.exists())
				directory.mkdir();

			FileCopyUtils.copy(file.getBytes(),
					new File(image.getPath(), image.getName()));
			image = imageRepository.save(image);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return image;
	}

	@RequestMapping(value = "/groceryCategoryIgnoreDuplicate", method = RequestMethod.POST)
	public @ResponseBody Object accessRoleAdd(
			@RequestBody GroceryCategory entity) throws RestException {
		boolean isGetGroceryCategoyExist = itemService
				.isGetGroceryCategoyExist(entity.getGrocerycategoryname());
		if (isGetGroceryCategoyExist == false) {
			return groceryCategoryRepository.save(entity);
		} else {
			String i18nMessageKey = "";
			throw new RestServiceException(
					ExceptionMessages.GROCERY_CATEGORY_ALREADY_EXIST,
					i18nMessageKey);
		}
	}

	@RequestMapping(value = "/itemCategoryIgnoreDuplicate", method = RequestMethod.POST)
	public @ResponseBody Object accessRoleAdd(@RequestBody ItemCategory entity)
			throws RestException {
		boolean isGetItemCategoryExist = itemService
				.isGetItemCategoryExist(entity.getItemcategoryname());
		if (isGetItemCategoryExist == false) {
			return itemCategoryRepository.save(entity);
		} else {
			String i18nMessageKey = "";
			throw new RestServiceException(
					ExceptionMessages.ITEM_CATEGORY_ALREADY_EXIST,
					i18nMessageKey);
		}
	}

	@RequestMapping(value = "/brandIgnoreDuplicate", method = RequestMethod.POST)
	public @ResponseBody Object accessRoleAdd(@RequestBody Brand entity)
			throws RestException {
		boolean isGetBrandExist = itemService.isGetBrandExist(entity
				.getBrandname());
		if (isGetBrandExist == false) {
			return brandRepository.save(entity);
		} else {
			String i18nMessageKey = "";
			throw new RestServiceException(
					ExceptionMessages.BRAND_NAME_ALREADY_EXIST, i18nMessageKey);
		}
	}

	@RequestMapping(value = "/itemsWithImagePath", method = RequestMethod.GET)
	public @ResponseBody Object getItemsWithImagePath(HttpServletRequest request)
			throws RestException {
		Map<Integer, Image> imageIdImageMap = new HashMap<Integer, Image>();

		List<Image> image = (List<Image>) imageRepository.findAll();
		for (Image imageObject : image) {
			imageIdImageMap.put(imageObject.getId(), imageObject);
		}

		Map<Integer, String> gidNameMap = new HashMap<Integer, String>();
		List<GroceryCategory> groceryCategory = (List<GroceryCategory>) groceryCategoryRepository
				.findAll();
		for (GroceryCategory obj : groceryCategory) {
			gidNameMap.put(obj.getGrocerycategoryid(),
					obj.getGrocerycategoryname());
		}
		Map<Integer, String> itemCategoryIdNameMap = new HashMap<Integer, String>();
		List<ItemCategory> itemCategory = (List<ItemCategory>) itemCategoryRepository
				.findAll();
		for (ItemCategory obj : itemCategory) {
			itemCategoryIdNameMap.put(obj.getItemcategoryid(),
					obj.getItemcategoryname());
		}

		List<Items> items = (List<Items>) itemsRepository.findAll();
		String url;
		List<ItemsWithImage> itemsWithImageList = new ArrayList<ItemsWithImage>();
		for (Items itemsObject : items) {
			ItemsWithImage itemsWithImage = new ItemsWithImage(itemsObject);
			itemsWithImage.setImage(imageIdImageMap.get(itemsObject
					.getImageid()));

			url = "/grocery/"
					+ gidNameMap.get(itemsObject.getGrocerycategoryid())
					+ "/"
					+ itemCategoryIdNameMap
							.get(itemsObject.getItemcategoryid()) + "/"
					+ itemsObject.getItemname();
			url = url.replaceAll("[^a-zA-Z0-9/]", " ");
			url = url.replaceAll("\\s+", " ").replaceAll(" ", "-");
			url = url.toLowerCase();
			itemsWithImage.setUrl(url);
			itemsWithImageList.add(itemsWithImage);
		}
		return itemsWithImageList;
	}

	@RequestMapping(value = "/searchItem", method = RequestMethod.GET)
	public @ResponseBody List<Items> searchItem(String name)throws RestException {
		return itemService.searchItem(name);
	}

	@RequestMapping(value = "/getitemcategorybyid", method = RequestMethod.POST)
	public ItemCategoryId getItemsName(@RequestBody ItemsInfo entity)throws RestException {
		return itemService.getItemsName(entity);
	}
	
	@RequestMapping(value = "/getOrderTotal",  method = RequestMethod.GET)
 	public List<CustomersOrder> getOrderTotal(@RequestParam("customerid") Integer customerid)throws RestException{
		return itemService.getOrderTotal(customerid);
	}
}
