package com.flowingcode.addons.template;

import com.vaadin.flow.component.html.Div;

@SuppressWarnings("serial")
public class TemplateDemo extends Div {

  public TemplateDemo() {
    add(new TemplateAddon());
  }
}
