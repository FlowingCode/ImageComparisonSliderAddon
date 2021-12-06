/*-
 * #%L
 * Template Add-on
 * %%
 * Copyright (C) 2021 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.flowingcode.addons.ics;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;

@SuppressWarnings("serial")
@NpmPackage(value = "img-comparison-slider", version = "7.3.2")
@JsModule("img-comparison-slider/dist/index.js")
@CssImport("img-comparison-slider/dist/styles.css")
@Tag("img-comparison-slider")
public class ImageComparisonSlider extends Div {

    public ImageComparisonSlider(String srcFirst, String altFirst, String srcSecond, String altSecond) {
        Image img1 = new Image(srcFirst, altFirst);
        Image img2 = new Image(srcSecond, altSecond);
        img1.getElement().setAttribute("slot", "first");
        img2.getElement().setAttribute("slot", "second");
        add(img1);
        add(img2);
    }

    public ImageComparisonSlider(Image first, Image second) {
        first.getElement().setAttribute("slot", "first");
        second.getElement().setAttribute("slot", "second");
        add(first);
        add(second);
    }

    public void setValue(Integer value) {
        getElement().setProperty("value", value);
    }

    public Integer getValue() {
        return getElement().getProperty("value", 50);
    }

    public void setSlideOnHover(boolean value) {
        getElement().setAttribute("hover", value);
    }

    public boolean isSlideOnHover() {
        return "true".equals(getElement().getAttribute("hover"));
    }

}
