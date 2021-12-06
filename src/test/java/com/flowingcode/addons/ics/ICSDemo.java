package com.flowingcode.addons.ics;

import com.vaadin.flow.component.html.Div;

@SuppressWarnings("serial")
public class ICSDemo extends Div {

  public ICSDemo() {
    ImageComparisonSlider ics = new ImageComparisonSlider("https://img-comparison-slider.sneas.io/images/green-leaves.webp", "First", "https://img-comparison-slider.sneas.io/images/green-leaves-blurred.webp", "Second");
    ics.setValue(70);
    ics.setSizeFull();
    add(ics);
  }
}
