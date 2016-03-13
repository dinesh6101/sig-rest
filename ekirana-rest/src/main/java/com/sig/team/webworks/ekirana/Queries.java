package com.sig.team.webworks.ekirana;

public class Queries {

	public final static String SELECT_ADD_TO_CART = " from AddToCart";

	public static final String CART_CART_BY_USER_ID = "delete AddToCart where userid = ?";

	public static final String GROCERY_CATEGORY_ID_BY_NAME = "select grocerycategoryid,grocerycategoryname from GroceryCategory where grocerycategoryname like :groceryCategoryName";

	public static final String ITEM_CATEGORY_ID_BY_NAME = "select itemcategoryid,itemcategoryname from ItemCategory where itemcategoryname like :itemCategoryName";

	public static final String ITEM_ID_BY_NAME = "select itemid,itemname from Items where itemname like  :itemname";

	public static final String CONFIRM_ORDER = "update CustomerOrder set orderStatus = :orderStatus,orderConfirmDate = :orderconfirmdate where customerid = :customerid";

	public static final String CANCEL_ORDER = "update CustomerOrder set orderStatus = :orderStatus, comments = :comment, orderCancelDate = :ordercanceldate where customerid = :customerid";

	
}
