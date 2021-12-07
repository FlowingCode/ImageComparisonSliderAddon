package com.flowingcode.vaadin.addons.ics;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.PageTitle;

@SuppressWarnings("serial")
@PageTitle("Basic demo")
@DemoSource(
    "https://raw.githubusercontent.com/FlowingCode/ImageComparisonSliderAddon/master/src/test/java/com/flowingcode/addons/ics/ICSDemo.java")
public class ICSDemo extends Div {

  public ICSDemo() {
    Image img1 = new Image("https://img-comparison-slider.sneas.io/images/green-leaves.webp", "First");
    Image img2 = new Image("https://img-comparison-slider.sneas.io/images/green-leaves-blurred.webp", "Second");
    img1.setWidthFull();
    img2.setWidthFull();
    ImageComparisonSlider ics = new ImageComparisonSlider(img1, img2);
    ics.setValue(70);
    ics.setSizeFull();
    ics.setSlideOnHover(true);
    add(ics);
  }
}
