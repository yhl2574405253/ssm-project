package cn.et.tool;

public class CommonResponse<T> extends Response {
    private T result;

    public CommonResponse(){

    }

    public CommonResponse(T result){
        this("请求处理成功",result);
    }

    public CommonResponse(String message,T result){
        this.setMessage(message);
        this.setCode("SUCCESS");
        this.setResult(result);
    }


    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
