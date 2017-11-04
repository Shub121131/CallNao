package com.ordernao.utility;

//make the class non-extendable by adding final
public final class OrderNaoConstants {
	// Hide the constructor
	private OrderNaoConstants() {
	}

	// Constants :-
	public static String EMPTY_PASSWORD = "";
	// TODO admin id will be changed in near future (temparory we are using 1
	// for every customer)
	public static int ADMIN_ID = 1;

	// Queries
	public static String CHECK_EXISTING_CUSTOMER = "checkExistingCustomer";
	public static final String GET_EXISTING_CUSTOMER_INFO = "getExistingCustomerInfo";
	public static final String GET_NEW_CUSTOMER_INFO = "getNewCustomerInfo";
	public static final String SET_NEW_CUSTOMER_DETAILS = "setNewCustomerDetails";
	public static final String GET_CUSTOMER_ID_FROM_CONTACT_NUMER = "getCustomerIdFromContactNumber";
	public static final String SAVE_NEW_ORDER_INFO_FOR_CUSTOMER_IN_ORDERDETAILS_TABLE = "saveOrderInfoOfCustomerInOrderDetails";
	public static final String SAVE_NEW_ORDER_INFO_FOR_CUSTOMER_IN_ORDERS_TABLE = "saveNewOrderInfoForCustomerInOrdersTable";
	public static final String FETCH_ORDERNUMBER_FROM_CUSTOMER_ID = "fetchOrderNumberFromCustomerId";
	public static final String SAVE_NEW_EMPLOYEE = "saveNewEmployee";
	public static final String CHECK_FOR_USERNAME = "checkForUsername";
	public static final String SAVE_MULTIPLE_ORDERS = "saveMultipleOrders";
	public static final String GET_ORDER_DETAILS_OF_CUSTOMER = "getOrderDetailsOfCustomer";
	public static final String GET_DELIVERY_BOYS_LIST = "getDeliveryBoysList";
	public static final String UPDATE_DELIVERY_BOYS = "updateDeliveryBoy";
	public static final String GET_MORE_DETAILS_OF_ORDER = "fetchMoreDetailOfOrder";
	public static final String FILTER_ORDER_BY_STATUS = "filterOrderByStatus";

	public static final String COLUMN_NAME_USERID = "users.id";
	public static final String COLUMN_NAME_USER_FIRSTNAME = "users.firstname";
	public static final String COLUMN_NAME_USER_LASTNAME = "users.lastname";
	public static final String COLUMN_NAME_USER_PHONE = "users.phone";
	public static final String COLUMN_NAME_CUSTOMER_PHONE = "customer.phone";
	public static final String COLUMN_NAME_ORDER_NUMBER = "orderdetails.orderno";
	public static final String COLUMN_NAME_ORDER_DATE = "orders.date";
	public static final String COLUMN_NAME_ORDER_STATUS = "orders.status";
	public static final String COLUMN_NAME_PICKUP_POINT = "orderdetails.pickuppoint";
	public static final String COLUMN_NAME_DELIVERY_POINT = "orderdetails.deliverypoint";
	public static final String COLUMN_NAME_ITEM_NAME = "orderdetails.itemName";
	public static final String COLUMN_NAME_TOTAL_DISTANCE = "orders.totalDistance";
	public static final String COLUMN_NAME_TOTAL_AMOUNT = "orders.totalAmount";
	public static final String COLUMN_NAME_CUSTOMER_FIRSTNAME = "customer.firstname";
	public static final String COLUMN_NAME_CUSTOMER_LASTNAME = "customer.lastname";
	public static final String COLUMN_NAME_CUSTOMER_ADDRESS = "customer.address";
	public static final String COLUMN_NAME_ORDER_COMMENTS = "orders.comments";
	public static final String COLUMN_NAME_ORDER_COMMENT_STATUS = "orders.commentstatus";
	public static final int CUSTOMER_EXIST = 0;
	public static final int INVALID_EMPLOYEE_TYPE = -1;
	public static final String MANAGER = "manager";
	public static final String CALL_OPERATOR = "callOperator";
	public static final String DELIVERY_BOY = "deliveryBoys";
	public static final int ADMIN_TYPE = 1;
	public static final int MANAGER_TYPE = 2;
	public static final int CALL_OPERATOR_TYPE = 3;
	public static final int DELIVERY_BOY_TYPE = 4;
	public static final int MAX_MOBILE_NUMBER_LENGTH = 10;
	public static final String RETURN_STATUS_INCORRECT_MOBILE_NUMBER = "incorrectPhoneNumber";
	public static final String SESSION_ATTRIBUTE_CONTACT_NUMBER = "contactNumber";
	public static final String SESSION_ATTRIBUTE_ORDERBEAN = "order";
	public static final String SESSION_ATTRIBUTE_NEW_CUSTOMER = "newCustomer";
	public static final String STRING_TRUE = "TRUE";
	public static final String STRING_FALSE = "FALSE";
	public static final String RETURN_STATUS_SUCCESS = "success";
	public static final String RETURN_STATUS_ERROR = "error";
	public static final String PATH_SAVE_CONTACT_NUMBER = "/save-contact-number";
	public static final String PATH_SAVE_NEW_CUSTOMER = "/save-new-customer-and-order";
	public static final String REQUEST_PARAM_CONTACT_NUMBER = "contactNumber";
	public static final String MODAL_ATTRIBUTE_ORDERBEAN = "order";
	public static final String RETURN_STATUS_EMPTY_FIRSTNAME = "emptyFirstName";
	public static final String RETURN_STATUS_EMPTY_LASTNAME = "emptyLastName";
	public static final String RETURN_STATUS_INVALID_CONTACT_NUMBER = "invalidContactNumber";
	public static final String RETURN_STATUS_EMPTY_ITEM = "emptyItem";
	public static final String RETURN_STATUS_EMPTY_PICKUP_LOCATION = "emptyPickupLocation";
	public static final String RETURN_STATUS_EMPTY_DELIVERY_LOCATION = "emptyDeliveryLocation";
	public static final String RETURN_STATUS_INCORRECT_DISTANCE = "incorrectDistance";
	public static final String RETURN_STATUS_INCORRECT_SERVICE_CHARGE = "incorrectServiceCharge";
	public static final String PATH_SAVE_NEW_ORDER_FOR_EXISTING_CUSTOMER = "/saveNewOrderForExistingCustomer";
	public static final String RETURN_STATUS_FAIL = "fail";
	public static final String PATH_ADD_EMPLOYEE = "/addEmployee";
	public static final String MODAL_ATTRIBUTE_EMPLOYEE_BEAN = "employeeBean";
	public static final String RETURN_STATUS_EMPTY_USERNAME = "emptyUsername";
	public static final String RETURN_STATUS_EMPTY_PASSWORD = "emptyPassword";
	public static final String RETURN_STATUS_EMPTY_CONFIRM_PASSWORD = "emptyConfirmPassword";
	public static final String RETURN_STATUS_PASSWORD_DOESNOT_MATCH = "passwordsDontMatch";
	public static final String RETURN_STATUS_USERNAME_NOT_AVAILABLE = "userNameNotAvailable";
	public static final String PATH_MORE_DETAILS_OF_ORDER = "/more-detail-of-order";
	public static final String REQUEST_PARAM_ORDERNUMBER = "orderNumber";
	public static final String RETURN_STATUS_MORE_DETAILS_OF_ORDER = "moreDetailsOfOrder";
	public static final String MODAL_ATTRIBUTE_MORE_DETAIL_OF_ORDER = "moreOrderDetails";
	public static final String PATH_ASSIGN_ORDER_TO_DELIVERY_BOY = "/assign-order-to-delivery-boy";
	public static final String REQUEST_PARAM_DELIVERY_BOYID = "deliveryBoyId";
	public static final String PATH_FILTER_ORDER_BY_STATUS = "/filter-orders-by-status";
	public static final String REQUEST_PARAM_STATUS = "status";
	public static final String MODAL_ATTRIBUTE_TRACK_ORDER_BEAN = "trackOrderBean";
	public static final String MODAL_ATTRIBUTE_DELIVERY_BOYS_BEAN = "deliveryBoysBean";
	public static final String PATH_FRAGMENTS_TRACK_DELIVERY_TABLE = "fragments/trackDeliveryTable";
	public static final String PATH_FILTER_ORDER_BY_DATE = "/filter-orders-by-date";
	public static final String REQUEST_PARAM_DATE = "date";
	public static final String PATH_FILTER_ORDER_BY_ASSIGNMENT = "/filter-orders-by-assignment";
	public static final String REQUEST_PARAM_ASSIGNMENT = "assignment";
	public static final String REQUEST_PARAM_SEARCH_KEY = "searchKey";
	public static final String PATH_TRACK_DELIVERY_SEARCH = "/track-delivery-search";
	public static final String PATH_TRACK_DELIVERY_PAGE = "trackdelivery";
	public static final String PATH_TRACK_DELIVERY_HTML_PAGE = "/trackdelivery.html";
	public static final String PATH_SUMMARY_PAGE = "summary";
	public static final String PATH_SUMMARY_HTML_PAGE = "/summary.html";
	public static final String PATH_MORE_ORDER_DETAILS_PAGE = "moreDetailsOfOrder";
	public static final String PATH_MORE_ORDER_DETAILS_HTML_PAGE = "/moreDetailsOfOrder.html";
	public static final String PATH_TRACK_DELIVERY_TABLE_PAGE = "trackDeliveryTable";
	public static final String PATH_TRACK_DELIVERY_TABLE_HTML_PAGE = "fragments/trackDeliveryTable";
	public static final String DEFAULT_ORDER_STATUS_PENDING = "Pending";
	public static final String ORDER_STATUS_PENDING = "Pending";
	public static final String ORDER_STATUS_DELIVERED = "Delivered";
	public static final String ORDER_STATUS_FAILED = "Failed";
	public static final String SESSION_ATTRIBUTE_FILTER_ORDER_STATUS = "orderStatus";
	public static final String SESSION_ATTRIBUTE_FILTER_ORDER_TIME = "orderTime";
	public static final String SESSION_ATTRIBUTE_FILTER_ORDER_ASSIGNMENT = "orderAssignment";
	public static final String COMMENT_STATUS_FAILED = "Failed ";
	public static final String PATH_COMMENTS_OF_FAILED_STATUS = "/comments-of-failed-order";
	public static final String GET_COMMENTS_DETAILS_OF_FAILED_ORDER = "getCommentsOfFailedOrder";
	public static final String COLUMN_NAME_ORDER_COUNT = "orderCount";
	public static final String COLUMN_NAME_PRODUCT_CHARGE = "orders.productCharge";
	public static final String COLUMN_NAME_SERVICE_CHARGE = "orders.serviceCharge";
	public static final String CHECK_FAILED_STATUS = "checkFailedOrder";
	public static final String PATH_FRAGMENTS_FAILED_ORDER_DETAILS = "fragments/failedOrderDetails";
	public static final String PATH_SUSPICIOUS_ACTIVITY = "suspiciousActivity";
	public static final String PATH_ORDER_STATUS_MODAL = "/order-status-modal";
	public static final String CHECK_FOR_PENDING_OR_DELIVERED_ORDER = "checkForPendingOrDeliveredOrder";
	public static final String SESSION_ATTRIBUTE_ORDER_NUMBER = "orderNum";
	public static final String PATH_SAVE_FAILED_STATUS_COMMENT = "/save-failed-status-comments-of-order";
	public static final String SAVE_FAILED_COMMENTS_STATUS = "saveFailedOrderComments";
	public static final String PATH_ERROR_MODAL_PAGE = "ErrorModal";
	public static final String PATH_PENDING_OR_FAILED_MODAL = "/pending-or-delivered-order-modal";
	public static final String PATH_SAVE_PENDING_OR_DELIVERED_ORDER_STATUS = "/save-pending-or-delivered-status-of-order";
	public static final String REQUEST_PARAM_NEW_STATUS_OF_ORDER = "newOrderStatus";
	public static final String SESSION_ATTRIBUTE_NEW_ORDER_STATUS = "newStatusOfOrder";
	public static final String SAVE_PENDING_OR_DELIVERED_ORDER_STATUS = "savePendingOrDeliveredOrderStatus";
	public static final String CHECK_DELIVERY_BOY_ID_IN_DB = "checkDeliveryBoyIdInDB";
	public static final String MODAL_ATTRIBUTE_ERROR_MESSAGE = "ErrorMessage";
	public static final Object ERROR_MSG_HEADER = "Error";
	public static final Object ERROR_MSG = "Error occured during operation,try again";
	public static final Object VALUES_LESS_THAN_ZERO = "Values of Total Service Amount to deposit & Money provided in morning can't be less than zero.";
	public static final Object SUSPICIOUS_ACTIVITY_MSG_HEADER = "Warning";
	public static final Object SUSPICIOUS_ACTIVITY_MSG = "Suspicious Activity Detected";
	public static final String MODAL_ATTRIBUTE_ERROR_MESSAGE_HEADER = "ErrorMsgHeader";
	public static final String ORDER_DATE_TODAY = "Today";
	public static final String ORDER_DATE_THIS_MONTH = "Month";
	public static final String ORDER_DATE_LAST_SEVEN_DAYS = "LastSevenDays";
	public static final String ORDER_DATE_TILL_DATE = "TillDate";
	public static final String MYSQL_DATE_TODAY = "DATE(orders.date) =  current_date() ";
	public static final String MYSQL_DATE_TILL_DATE = " DATE(orders.date) <=current_date() ";
	public static final String MYSQL_DATE_THIS_MONTH = " DATE(orders.date) >= current_date() - INTERVAL 30 DAY AND DATE(orders.date) < current_date() ";
	public static final String MYSQL_DATE_LAST_SEVEN_DAYS = " DATE(orders.date) >= current_date() - INTERVAL 7 DAY AND DATE(orders.date) < current_date() ";
	public static final String ORDER_ASSIGNED = "Assigned";
	public static final String ORDER_UNASSIGNED = "Unassigned";
	public static final String MYSQL_DELIVERY_BOY_ID_NOT_NULL = " orders.DeliveryPersonId IS NOT NULL ";
	public static final String MYSQL_DELIVERY_BOY_ID_NULL = " orders.DeliveryPersonId IS NULL ";
	public static final String MYSQL_AND = " AND ";
	public static final String ADMIN = "ADMIN";
	public static final String PATH_FILTER_TRACK_ORDER = "/filter-track-order";
	public static final String RETURN_STATUS_SUSPICIOUS_ACTIVITY = "suspiciousActivity";
	public static final String REQUEST_PARAM_NEW_STATUS = "newStatus";
	public static final String REQUEST_PARAM_FAILED_STATUS_COMMENTS = "failedComments";
	public static final String SESSION_ATTRIBUTE_SEARCH_KEY = "searchKeyValue";
	public static final String PATH_SUBMIT_REPORT_HTML = "submitreport.html";
	public static final String PATH_SUBMITTION_REPORTS = "submitreport";
	public static final String PATH_DELIVERY_BOY_PAYMENT_DETAILS = "delivery-boy-payment-details";
	public static final String PATH_UPDATE_MONEY_PROVIDED_TO_DELIVERY_BOY = "update-delivery-boy-money-provided";
	public static final String REQUEST_PARAM_DELIVERY_BOY_ID = "deliveryBoyId";
	public static final String GET_TOTAL_DISTANCE_TRAVELLED_BY_DELIVERY_BOY = "getTotalDistanceTravelledByDeliveryBoy";
	public static final String TOTAL_DISTANCE_TRAVELLED = "totalDistanceTravelledByDeliveryBoy";

	public static final String PATH_FRAGMENTS_DELIVERY_BOY_TRANSACTION = "fragments/deliveryBoysPaymentDetails";
	public static final String PATH_FRAGMENTS_DELIVERY_BOY_TRIP = "fragments/deliveryBoysTripDetails";
	public static final String MODAL_ATTRIBUTE_DELIVERY_BOY_TRANSACTION_BEAN = "deliveryBoyTransaction";
	public static final String GET_DELIVERY_BOY_TRANSACTION = "getDeliveryBoyTransaction";
	public static final String COLUMN_NAME_SERVICE_CHARGE_TO_COLLECT = "totalServiceChargeToCollect";
	public static final String REQUEST_PARAM_SERVICE_AMOUNT_TO_DEPOSIT = "serviceAmountToDeposit";
	public static final String REQUEST_PARAM_MONEY_PROVIDED = "moneyProvidedInMorning";
	public static final double TOTAL_SERVICE_CHARGE_TO_BE_COLLECTED = 0;
	public static final double OPERATION_FAILED = -1;
	public static final String GET_DELIVERY_BOY_PAYMENT_DETAILS = "getDeliveryBoyPaymentDetails";
	public static final String COLUMN_NAME_TOTAL_DISTANCE_TRAVELLED = "totalDistanceTravelled";
	public static final String COLUMN_NAME_TOTAL_MONEY_PROVIDED = "dailytransaction.money_provided";
	public static final String COLUMN_NAME_TOTAL_SERVICE_CHARGE_TO_COLLECT = "totalServiceChargeToCollect";
	public static final String COLUMN_NAME_TOTAL_MONEY_SUBMISSION = "users.total_money_submission";
	public static final String MODAL_ATTRIBUTE_DELIVERY_BOY_TRANSACTION_DETAILS = "deliveryBoy";
	public static final String MODAL_ATTRIBUTE_TOTAL_SUBMISSION = "totalSubmission";
	public static final String COLUMN_NAME_DELIVERY_BOY_ID = "orders.DeliveryPersonId";
	public static final String CHECK_FOR_CURRENT_DATE_ENTRY_OF_MONEY_PROVIDED = "checkForCurrentDateEntryOfMoneyProvided";
	public static final String UPDATE_MONEY_PROVIDED_TO_DELIVERY_BOY = "updateMoneyProvidedToDeliveryBoy";
	public static final String INSERT_CURRENT_DATE_ENTRY_FOR_MONEY_PROVIDED = "insertCurrentDateEntryForMoneyProvided";
	public static final String GET_TOTAL_MONEY_PROVIDED = "getTotalMoneyProvided";
	public static final String GET_TOTAL_SUM_OF_SERVICE_CHARGE_OF_DELIVERED_ORDERS = "getSumOfServiceCharge";
	public static final String MODAL_ATTRIBUTE_TOTAL_MONEY_TO_BE_COLLECTED = "totalMoneyToBeCollected";
	public static final String PATH_DELIVERY_BOY_TRIP_DETAILS = "delivery-boy-trip-details";
	public static final String GET_DELIVERY_BOY_TRIP_DETAILS = "getOrderDetailsAssignedToDeliveryBoy";
	public static final String MODAL_ATTRIBUTE_ORDER_ASSIGNED_TO_DELIVERY_BOYS = "deliveryBoyTripDetails";
	public static final String PATH_FRAGMENTS_DELIVERY_BOY_TRIP_DETAILS = "fragments/deliveryBoysTripDetails";
	public static final String VALUE_LESS_THAN_ZERO = "Money provided in morning should be greater than zero.";
	public static final String PATH_UPDATE_MONEY_SUBMITTED_BY_DELIVERY_BOY = "update-money-submitted-by-delivery-boy";
	public static final String REQUEST_PARAM_SUBMITTED_MONEY_COMMENTS = "comments";
	public static final String EMPTY_COMMENTS = "Comments can't be empty.";
	public static final String UPDATE_MONEY_SUBMITTED_BY_DELIVERY_BOY = "updateMoneySubmittedByDeliveryBoy";
	public static final String COLUMN_NAME_MONEY_COLLECTED = "dailytransaction.money_collected";
	public static final String GET_TOTAL_MONEY_COLLECTED = "getTotalMoneyCollected";
	public static final String MODAL_ATTRIBUTE_TOTAL_MONEY_COLLECTED = "totalMoneyCollected";
	public static final String ALL_PAYMENT_DETAILS = "all-payment-details";
	public static final Object NO_MONEY_TO_SUBMIT = "No money to submit";
	public static final String MODAL_ATTRIBUTE_MONEY_ALREADY_SUBMITTED = "moneyAlreadySubmitted";
	public static final String PATH_GET_MORE_DETAIL_OF_TRIP = "get-more-detail-of-trip";
	public static final String GET_DELIVERY_BOY_TRIP_MORE_DETAILS = "getMoreDetailsOfTrip";
	public static final String PATH_FRAGMENTS_DELIVERY_BOY_TRIP_MORE_DETAILS = "fragments/deliveryBoyTripMoreDetails";
	public static final String PATH_REPORTS_HTML_PAGE = "/reports.html";
	public static final String PATH_REPORTS_PAGE = "reports";
	public static final String GET_TOTAL_ORDER_COUNT_OF_CURRENT_DATE = "getTotalOrderCountOfCurrentDate";
	public static final String GET_SUCCESSFULL_ORDER_COUNT_OF_CURRENT_DATE = "getSuccessfullOrderCountOfCurrentDate";
	public static final String GET_FAILED_ORDER_COUNT_OF_CURRENT_DATE = "getFailedOrderCountOfCurrentDate";
	public static final String GET_TOTAL_ORDER_COUNT_OF_WEEK = "getTotalOrderCountOfWeek";
	public static final String GET_SUCCESSFULL_ORDER_COUNT_OF_WEEK = "getSuccessfullOrderCountOfWeek";
	public static final String GET_FAILED_ORDER_COUNT_OF_WEEK = "getFailedOrderCountOfWeek";
	public static final String GET_TOTAL_ORDER_COUNT_OF_MONTH = "getTotalOrderCountOfMonth";
	public static final String GET_SUCCESSFULL_ORDER_COUNT_OF_MONTH = "getSuccessfullOrderCountOfMonth";
	public static final String GET_FAILED_ORDER_COUNT_OF_MONTH = "getFailedOrderCountOfMonth";
	public static final String MODEL_ATTRIBUTE_CURRENT_DATE_TOTAL_ORDERS = "totalOrdersOfCurrentDate";
	public static final String MODEL_ATTRIBUTE_CURRENT_DATE_SUCCESSFULL_ORDERS = "successfullOrdersOfCurrentDate";
	public static final String MODEL_ATTRIBUTE_CURRENT_DATE_FAILED_ORDERS = "failedOrdersOfCurrentDate";
	public static final String MODEL_ATTRIBUTE_WEEK_TOTAL_ORDERS = "totalOrdersOfWeek";
	public static final String MODEL_ATTRIBUTE_WEEK_SUCCESSFULL_ORDERS = "successfullOrdersOfWeek";
	public static final String MODEL_ATTRIBUTE_WEEK_FAILED_ORDERS = "failedOrdersOfWeek";
	public static final String MODEL_ATTRIBUTE_MONTH_TOTAL_ORDERS = "totalOrdersOfMonth";
	public static final String MODEL_ATTRIBUTE_MONTH_SUCCESSFULL_ORDERS = "successfullOrdersOfMonth";
	public static final String MODEL_ATTRIBUTE_MONTH_FAILED_ORDERS = "failedOrdersOfMonth";
	public static final String PATH_MONTHLY_REPORT_OF_ORDER = "/get-monthly-detail-of-order";
	public static final String PATH_FRAGMENTS_ORDERS_MONTHLY_STATUS = "fragments/ordersMonthlyStatus";
	public static final String PATH_GET_ORDER_REPORTS = "/get-order-reports";

	public static final String GET_MORE_DETAILS_OF_TOTAL_ORDERS_OF_CURRENT_DATE = "getMoreDetailsOfTotalOrderOfCurrentDate";
	public static final String GET_MORE_DETAILS_OF_SUCCESSFULL_ORDERS_OF_CURRENT_DATE = "getMoreDetailsOfSuccessfullOrderOfCurrentDate";
	public static final String GET_MORE_DETAILS_OF_FAILED_ORDERS_OF_CURRENT_DATE = "getMoreDetailsOfFailedOrderOfCurrentDate";
	public static final String GET_MORE_DETAILS_OF_TOTAL_ORDERS_OF_WEEK = "getMoreDetailsOfTotalOrderOfWeek";
	public static final String GET_MORE_DETAILS_OF_SUCCESSFULL_ORDERS_OF_WEEK = "getMoreDetailsOfSuccessfullOrderOfWeek";
	public static final String GET_MORE_DETAILS_OF_FAILED_ORDERS_OF_WEEK = "getMoreDetailsOfFailedOrderOfWeek";
	public static final String MODEL_ATTRIBUTE_DETILS_OF_ORDERS_FOR_REPORT = "orderReportList";
	public static final int FOR_DAILY_TOTAL_ORDER_REPORT = 1;
	public static final int FOR_DAILY_SUCCESSFULL_ORDER_REPORT = 2;
	public static final int FOR_DAILY_FAILED_ORDER_REPORT = 3;
	public static final int FOR_WEEKLY_TOTAL_ORDER_REPORT = 4;
	public static final int FOR_WEEKLY_SUCCESSFULL_ORDER_REPORT = 5;
	public static final int FOR_WEEKLY_FAILED_ORDER_REPORT = 6;
	public static final String PATH_ORDER_DETAIL_REPORTS_MODAL = "orderDetailReportsModal";
	public static final String GET_MORE_DETAILS_OF_TOTAL_ORDERS_OF_MONTH = "getOrderDetailsOfTotalOrderOfMonth";
	public static final String GET_MORE_DETAILS_SUCCESSFULL_TOTAL_ORDERS_OF_MONTH = "getOrderDetailsOfSuccessfullOrderOfMonth";
	public static final String GET_MORE_DETAILS_OF_FAILED_ORDERS_OF_MONTH = "getOrderDetailsOfFailedOrderOfMonth";
	public static final String PATH_MONTHLY_ORDER_REPORTS="/get-monthly-order-reports";
	public static final int FOR_MONTHLY_TOTAL_ORDER_REPORT = 1;
	public static final int FOR_MONTHLY_SUCCESSFULL_ORDER_REPORT = 2;
	public static final int FOR_MONTHLY_FAILED_ORDER_REPORT = 3;
}