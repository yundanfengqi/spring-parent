package com.custom;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-08 10:38
 **/

public class MyView implements View {
    private String url;

    public MyView(String url) {
        this.url = url;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if(model!=null){
            for (Map.Entry<String, ?> entry : model.entrySet()) {
                httpServletRequest.setAttribute(entry.getKey(), entry.getValue());
            }
        }

        httpServletRequest.getRequestDispatcher(url).forward(httpServletRequest, httpServletResponse);
    }
}
