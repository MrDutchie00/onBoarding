package com.example.on_boarding;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class VolleyHelper{


            private final RequestQueue requestQueue;

            private final String baseUrl;

            public VolleyHelper(Context c, String baseUrl) {
                this.requestQueue = Volley.newRequestQueue(c);
                this.baseUrl = baseUrl;

            }

            private String contructUrl(String method){
                return baseUrl + "/" + method;
            }



            public void get(String method, JSONObject jsonRequest,
                            LastScreenActivity listener, LastScreenActivity errorListener){

                JsonObjectRequest objRequest = new JsonObjectRequest(Request.Method.GET, contructUrl(method), jsonRequest, listener, errorListener);
                requestQueue.add(objRequest);
            }

            public void put(String method, JSONObject jsonRequest,
                            Response.Listener<JSONObject> listener, Response.ErrorListener errorListener){

                JsonObjectRequest objRequest = new JsonObjectRequest(Request.Method.PUT, contructUrl(method), jsonRequest, listener, errorListener);
                requestQueue.add(objRequest);
            }

            public void post(String method, JSONObject jsonRequest,
                             Response.Listener<JSONObject> listener, Response.ErrorListener errorListener){

                JsonObjectRequest objRequest = new JsonObjectRequest(Request.Method.POST, contructUrl(method), jsonRequest, listener, errorListener);
                requestQueue.add(objRequest);
            }

            public void delete(String method, JSONObject jsonRequest,
                               Response.Listener<JSONObject> listener, Response.ErrorListener errorListener){

                JsonObjectRequest objRequest = new JsonObjectRequest(Request.Method.DELETE, contructUrl(method), jsonRequest, listener, errorListener);
                requestQueue.add(objRequest);
            }

    }

