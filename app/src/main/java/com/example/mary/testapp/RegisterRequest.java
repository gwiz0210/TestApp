package com.example.mary.testapp;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;



/**
 * Created by Mary on 5/10/2016.
 */
class RegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "http://ffff.netai.net/Register.php";
    private Map<String,String> params;

    public RegisterRequest(String name, String school, String email, String password, Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("email",email);
        params.put("password",password);

    }

    public Map<String, String> getParam() {
        return params;
    }
}

