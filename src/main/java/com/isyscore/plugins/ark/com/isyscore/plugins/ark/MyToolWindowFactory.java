package com.isyscore.plugins.ark.com.isyscore.plugins.ark;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class MyToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        toolWindow.setToHideOnEmptyContent(true);
        class MyPanel extends SimpleToolWindowPanel {

            public MyPanel(boolean vertical) {
                super(vertical);
                DefaultActionGroup group = new DefaultActionGroup();
                group.add(new TestAction());

                ActionToolbar  toolbar = ActionManager.getInstance().createActionToolbar("ToolBar",group,false);
                setToolbar(toolbar.getComponent());
            }
        }

        toolWindow.getContentManager().addContent(ContentFactory.SERVICE.getInstance().createContent(new MyPanel(false), "First", false), 0);
    }
}
