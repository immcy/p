package com.codewater.controller.other_pojo;

import java.util.Objects;

public class CodeWaterResult {
    private int code;
    private String msg;

    public CodeWaterResult() {
    }

    public CodeWaterResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeWaterResult result = (CodeWaterResult) o;
        return code == result.code &&
                Objects.equals(msg, result.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg);
    }

    @Override
    public String toString() {
        return "CodeWaterResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
