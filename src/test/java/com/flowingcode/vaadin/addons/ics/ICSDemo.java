package com.flowingcode.vaadin.addons.ics;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@PageTitle("Basic demo")
@DemoSource
@Route(value = "ics/ics", layout = ICSDemoView.class)
public class ICSDemo extends Div {

  public ICSDemo() {
    Image img1 = new Image("https://img-comparison-slider.sneas.io/images/green-leaves.webp", "First");
    Image img2 = new Image("https://img-comparison-slider.sneas.io/images/green-leaves-blurred.webp", "Second");
    img1.setWidthFull();
    img2.setWidthFull();
    ImageComparisonSlider ics = new ImageComparisonSlider(img1, img2);
    ics.setValue(70);
    ics.setWidthFull();
    ics.setSlideOnHover(true);
    add(ics);
  }
}
