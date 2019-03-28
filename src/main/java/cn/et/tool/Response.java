package cn.et.tool;

public class Response {
    protected static final String SUCCESS_MESSAGE = "请求处理成功";
    protected static final String SUCCESS_CODE = "SUCCESS";
    private String message;
    private String code;

    protected Response(){

    }

    public static Response success(){
        return success("请求处理成功");
    }

    public static Response success(String message){
        return response("SUCCESS",message);
    }

    public static Response response(String code,String message){
        Response response =new Response();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
