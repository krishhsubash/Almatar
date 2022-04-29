package com.playwright.java.helpers.dto;

public final class ElementReference {

  public static final class Home {
    public final static String USER_NAME = "input[name='loginfmt']";
    public final static String LOGIN_NEXT = "input[type='submit']";
    public final static String PASSWORD_LINK = "//span[text()='Password']";
    public final static String PASSWORD = "input[name='passwd']";
    public final static String PASSWORD_INPUT = "#passwordInput";
    public final static String SUBMIT_BUTTON = "#submitButton";
    public final static String APP_LANDING_PAGE = "#AppLandingPage";
    public final static String UCI_APP = "text='%s'";
    public final static String SUB_AREA = "//li[contains(@data-id,'%s')]";
    public final static String SIGN_IN_OPTION = "//span[text()='%s']";
  }

  public static final class Case {
    public final static String MENU_ITEM = "//span[text()='%s']";
    public final static String I_NEED_HELP_WITH = "input[data-id*='in_category_top_level']";
    public final static String REASON_LOOKUP = "input[data-id*='in_category_reason']";
    public final static String REASON_LOOKUP_RESULT = "span:has-text(\"Tax\")";
    public final static String REASON_DETAILS_LOOKUP = "input[data-id*='in_category_reason_details']";
    public final static String SUBJECT_FIELD = "input[data-id*='title']";
    public final static String DESCRIPTION = "textarea[data-id*='description']";
    public final static String COMMON_ACCOUNT = "input[data-id*='in_related_account']";
    public final static String COMMON_CONTACT = "input[data-id*='in_related_contact']";
    public final static String COMMON_OPPORTUNITY = "input[data-id*='in_related_opportunity']";
    public final static String PRODUCT_LINE = "input[data-id*='in_product_line']";
    public final static String SAVE_AND_CLOSE = "button[data-lp-id*='ok_button']";
  }

  public static final class Bullet {
    public final static String LOGIN_BUTTON = "//button[text()='Login']";
    public final static String NEXT_BUTTON = "//input[@value='%s']";
    public final static String BULLET_HOME = "//span[text()='Bullet']";
    public final static String BULLET_MENU = "//a/span[text()='%s']";
    public final static String BULLET_TRANSFER = "//span[text()='Transfer']";
    public final static String BULLET_DOWNLOAD = "//button[text()='Download Template']";
    public final static String BULLET_TAB = "//li/a[text()='%s']";
    public final static String TRANSFER_OPTION = "//a/div[text()='%s']";
    public final static String VIEW_BUTTON = "button>i";
    public final static String VIEW_TEXT = "text=View";
    public final static String USE_PASSWORD_LINK = "//a[text()='Use your password instead']";
    public final static String SIGN_IN = "//span[text()='Sign in']";
    public final static String SIGN_IN_PHONE_TOKEN = "text=Sign in with your phone or token device";
    public final static String ALTERNATE_OPTION = "#differentVerificationOption";
    public final static String VERIFICATION_OPTION1 = "#verificationOption1";
    public final static String FILE_UPLOAD = "input";
    public final static String DELETE_ICON = ".mdi-delete";
  }

  public static final class SFDC {
    public final static String USERNAME = "input#username";
    public final static String PASSWORD = "input#password";
    public final static String LOGIN_BUTTON = "text=Log In to Sandbox";
    public final static String OPPORTUNITY_TAB = "#Opportunity_Tab >> text=Opportunities";
    public final static String SFDC_HOME_BUTTON = "input:has-text('%s')";
  }

  public static final class Roster {
    public final static String USERNAME = "input[name='username']";
    public final static String PASSWORD = "input[name='password']";
    public final static String TOKEN = "input[name='token']";
    public final static String LOGIN_BUTTON = "button:has-text(\"Login\")";
    public final static String MASQUERADE_AS = "#masquerade-user-input";
    public final static String START_DATE = "input.artdeco-start-date";
    public final static String END_DATE = "input.artdeco-end-date";
    public final static String ADDITIONAL_NOTES = "//label[text()='Additional notes']/following-sibling::textarea";
  }

  public static final class Almatar {
    public final static String LANGUAGE_OPTION = "//div[@class='menu__language menu__item']//a[contains(text(),'%s')]";
    public final static String PRODUCT_OPTION = "//div[@class='main-pages']//a[text()='%s']";
    public final static String GOING_TO = "//input[@id='typeahead-http' and @placeholder='Destination or Hotel']";
    public final static String SEARCH_RESULT = "(//span[@class='result_content']/div/span)[1]";
    public final static String CHECK_IN_BOX = "//div[@class='search__item from_date']//input";
    public final static String CHECK_IN_DATE = "//table[@class='month2']//td/div[text()='29' and @class='day toMonth valid']";
    public final static String CHECK_OUT_BOX = "//div[@class='search__item to_date']//input";
    public final static String CHECK_OUT_DATE = "//table[@class='month2']//td/div[contains(@class,'day toMonth valid') and text()='30']";
    public final static String TRAVELLERS_OPTION = "//span[text()='Travelers']/parent::div/div[@class='search__item__input']";
    public final static String CHILDREN_ICON_PLUS = "//span[text()='Children ']/../following-sibling::div//button/i[@class='icon-plus ']";
    public final static String SEARCH_ICON = "//div[@class='search__action']/button/span";
    public final static String HOTEL_HOME_PAGE = "//div[contains(@class,'hotel-list-result')]//a[text()='Sheikh Ali Dahab Resort']";
    public final static String AVAILABLE_ROOMS = "//div[@class='payment-option']/following-sibling::a[text()='%s']";
    public final static String HOTEL_DETAILS_TAB = "//div[@id='single-hotel-page']//a[text()='hotel details']";
    public final static String HOTELS_TAB = "//ul[@class='tabs']//li/a[text()='%s']";
    public final static String BOOK_NOW = "(//div/h3[text()='%s']/../../..//div[@class='room-body']//button/span[contains(text(),'%s')])[1]";
    public final static String FIRST_NAME = "//input[@placeholder='First name']";
    public final static String LAST_NAME = "//input[@placeholder='Last name']";
    public final static String NAME_PREFIX = "//div[@class='row full-name-input']//div[@class='ng-select-container']//div/input[@role='combobox']";
    public final static String PREFIX_DROPDOWN = "//div[@class='ng-dropdown-panel-items scroll-host']//div/span[text()='%s']";
    public final static String EMAIL_ADDRESS = "//input[@placeholder='email']";
    public final static String PHONE_NUMBER = "//input[@placeholder='Phone Number *']";
    public final static String CONTINUE = "//span[text()='Continue']";
  }
}