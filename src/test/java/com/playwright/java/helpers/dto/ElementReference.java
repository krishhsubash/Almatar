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
}