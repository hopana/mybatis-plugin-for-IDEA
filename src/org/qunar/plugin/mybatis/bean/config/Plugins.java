/*
* Copyright (c) 2016 Qunar.com. All Rights Reserved.
*/
package org.qunar.plugin.mybatis.bean.config;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.SubTagList;

import java.util.List;

/**
 * Plugin node
 *
 * Author: jianyu.lin
 * Date: 2016/11/21 Time: 下午10:17
 */
public interface Plugins extends DomElement {

    @SubTagList("plugin")
    List<Plugin> getPlugins();
}
