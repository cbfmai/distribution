package com.mmtech.distribution.builder;

import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;

/**
 * @author Adam DENG
 * @Date 2018/7/5 14:45
 */
public class NewsBuilder {

    public WxMpXmlOutMessage build(WxMpXmlMessage wxMessage) {

        WxMpXmlOutNewsMessage.Item item = new WxMpXmlOutNewsMessage.Item();
        item.setTitle("点击申请最高50万授信额度，为你发展助力！");
        item.setPicUrl("http://umoney-10063217.cossh.myqcloud.com/066C6775-DFCE-47D8-B71B-9A5EF65CF561.png");
        item.setUrl("http://b7ef21dd.ngrok.io/");

        WxMpXmlOutNewsMessage m = WxMpXmlOutMessage.NEWS().addArticle(item)
                .fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser())
                .build();

        return m;
    }
}
