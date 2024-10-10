package com.project.restroom.pojo;

public class Result<T> {
    private int code;       // 状态码
    private String message; // 提示消息
    private T data;        // 返回的数据

    // 默认构造函数
    public Result() {}

    // 带参数的构造函数
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // Getter 和 Setter 方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // 静态方法用于快速创建结果对象
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "成功", data);
    }

    public static Result<?> failure(String message) {
        return new Result<>(500, message, null);
    }
}
