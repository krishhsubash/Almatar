package com.playwright.java.helpers.dto;

public final class Constants {

  public static final class CommonTestData {
    public static final String COMMON_ACCOUNT = "Common Automation Account";
    public static final String COMMON_CONTACT = "Common Contact";
    public static final String COMMON_OPPTY = "Common Automation Account-Common Opportunity";
    public static final String SMOKETEST_ENV = "EI";
    public static final String EMAIL_CONTENT = "A case you have requested/collaborated has been resolved";
    public static final String EMAIL_CONTENT_RESOLUTION_ACTION = "Provided Guidance or Education";
    public static final String EMAIL_CONTENT_RESOLUTION_REMARKS = "done";
    public static final String FIRST_NAME = "Common";
    public static final String LAST_NAME = "Contact";
    public static final String EMAIL = "Test@test.com";
    public static final String GDPR_SOURCE = "ProductUser";
    public static final String LOB = "LTS";
    public static final String OPPORTUNITY_TYPE = "NewBusiness";
    public static final String CURRENCY = "US Dollar";
    public static final String SALES_CHANNEL = "Direct";
  }

  public static final class CommonConstants {
    public static final int TIMEOUT = 90000;
    public static final String FILE_NAME = "testFile.csv";
  }

  public enum StatusCode {
    CODE_100(100, "continue"),
    CODE_101(101, "switching protocols"),
    CODE_102(102, "processing"),

    CODE_200(200, "ok"),
    CODE_201(201, "created"),
    CODE_202(202, "accepted"),
    CODE_203(203, "non-authoritative information"),
    CODE_204(204, "no content"),
    CODE_205(205, "reset content"),
    CODE_206(206, "partial content"),
    CODE_207(207, "multi-status (webdav; rfc 4918"),
    CODE_208(208, "already reported (webdav; rfc 5842)"),
    CODE_226(226, "im used (rfc 3229)"),

    CODE_300(300, "multiple choices"),
    CODE_301(301, "moved permanently"),
    CODE_302(302, "found"),
    CODE_303(303, "see other (since http/1.1)"),
    CODE_304(304, "not modified"),
    CODE_305(305, "use proxy (since http/1.1)"),
    CODE_306(306, "switch proxy"),
    CODE_307(307, "temporary redirect (since http/1.1)"),
    CODE_308(308, "permanent redirect (approved as experimental rfc)[12]"),

    CODE_400(400, "bad request"),
    CODE_401(401, "unauthorized"),
    CODE_402(402, "payment required"),
    CODE_403(403, "forbidden"),
    CODE_404(404, "not found"),
    CODE_405(405, "method not allowed"),
    CODE_406(406, "not acceptable"),
    CODE_407(407, "proxy authentication required"),
    CODE_408(408, "request timeout"),
    CODE_409(409, "conflict"),
    CODE_410(410, "gone"),
    CODE_411(411, "length required"),
    CODE_412(412, "precondition failed"),
    CODE_413(413, "request entity too large"),
    CODE_414(414, "request-uri too long"),
    CODE_415(415, "unsupported media type"),
    CODE_416(416, "requested range not satisfiable"),
    CODE_417(417, "expectation failed"),

    CODE_500(500, "internal server error"),
    CODE_501(501, "not implemented"),
    CODE_502(502, "bad gateway"),
    CODE_503(503, "service unavailable"),
    CODE_504(504, "gateway timeout"),
    CODE_505(505, "http version not supported"),
    CODE_506(506, "variant also negotiates (rfc 2295)"),
    CODE_507(507, "insufficient storage (webdav; rfc 4918)"),
    CODE_508(508, "loop detected (webdav; rfc 5842)"),
    CODE_509(509, "bandwidth limit exceeded (apache bw/limited extension)"),
    CODE_510(510, "not extended (rfc 2774)"),
    CODE_511(511, "network authentication required (rfc 6585)"),
    CODE_522(522, "connection timed out"),
    CODE_523(523, "proxy declined request"),
    CODE_524(524, "a timeout occurred");

    private final int code;
    private final String msg;

    StatusCode(int code, String msg) {
      this.code = code;
      this.msg = msg;
    }

    public int getCode() {
      return code;
    }

    public String getMsg() {
      return msg;
    }
  }

  public enum Application {
    SFDC("SFDC"),
    MSCRM("MSCRM"),
    ROSTER("Roster"),
    BULLET("Bullet"),
    SALESLOFT("Salesloft");

    final String _value;

    Application(String value) {
      _value = value;
    }

    @Override
    public String toString() {
      return this._value;
    }
  }
}