package com.sig.team.webworks.ekirana;

public class Queries {

	public final static String SELECT_ADD_TO_CART = " from AddToCart";

	public static final String CART_CART_BY_USER_ID = "delete AddToCart where userid = ?";

	public static final String GROCERY_CATEGORY_ID_BY_NAME = "select grocerycategoryid,grocerycategoryname from GroceryCategory where grocerycategoryname like :groceryCategoryName";

	public static final String ITEM_CATEGORY_ID_BY_NAME = "select itemcategoryid,itemcategoryname from ItemCategory where itemcategoryname like :itemCategoryName";

	public static final String ITEM_ID_BY_NAME = "select itemid,itemname from Items where itemname like  :itemname";

	public static final String CONFIRM_ORDER = "update CustomerOrder set orderStatus = :orderStatus,orderConfirmDate = :orderconfirmdate where customerid = :customerid";

	public static final String CANCEL_ORDER = "update CustomerOrder set orderStatus = :orderStatus, comments = :comment, orderCancelDate = :ordercanceldate where customerid = :customerid";

	public static final String ORDER_STATUS = "select distinct a.itemid, p.cost as itemUnitPriceWithoutDiscount, "
			+ "a.discountinperentage, (p.cost*(a.discountinperentage/100)) as savedCost,"
			+ "(p.cost-(p.cost*(a.discountinperentage/100))) as itemUnitPriceWithDiscount from Item_Offers as a "
			+ "Inner Join Items as p on a.itemid = p.itemid where a.itemid IN "
			+ "(select b.itemid from customer_order as b where b.orderStatus = 'PRE_PLACED' and customerid = :customerid)"
			+ "order by a.itemid"; 
			
	public static final String GET_DISCOUNT_COUPON = "select d.coupon_code,c.orderTrackId custorderTrackId from customer_order as c join customer_order_coupon as d " 
								+" join discount_coupon as f " 
								+" where c.orderTrackId=d.orderTrackId  and d.coupon_code=f.coupon_code and c.customerId= :customerid ";
}