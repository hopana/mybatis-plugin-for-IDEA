/*
* Copyright (c) 2016 Qunar.com. All Rights Reserved.
*/
package org.qunar.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.qunar.plugin.service.JavaService;
import org.qunar.plugin.util.Modules;

/**
 *
 *
 * Author: jianyu.lin
 * Date: 2016/11/21 Time: 上午11:35
 */
public class DebugAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        System.out.println(Modules.getModuleSettingByElement(JavaService
                .getInstance(project).findClass("com.qunar.hotel.qta.spa.man.bean.remote.User")));
        System.out.println(project + "\n");
    }
}
