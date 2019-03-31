/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2019 Grégory Van den Borre
 *
 *  More infos available: https://engine.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */
package be.yildizgames.module.window.swt.widget;

import be.yildizgames.module.coordinate.Coordinates;
import be.yildizgames.module.window.widget.WindowInputBox;
import be.yildizgames.module.window.widget.WindowInputBoxChangeListener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SwtWindowInputBox implements WindowInputBox {

    private final Text input;

    public SwtWindowInputBox(Shell parent) {
        super();
        this.input = new Text(parent, 0);
    }

    @Override
    public WindowInputBox setCoordinates(Coordinates coordinates) {
        return this;
    }

    @Override
    public WindowInputBox setVisible(boolean visible) {
        this.input.setVisible(visible);
        return this;
    }

    @Override
    public WindowInputBox setText(String text) {
        this.input.setText(text);
        return this;
    }

    @Override
    public String getText() {
        return this.input.getText();
    }

    @Override
    public WindowInputBox setToolTip(String tooltip) {
        this.input.setToolTipText(tooltip);
        return this;
    }

    @Override
    public WindowInputBox onChange(WindowInputBoxChangeListener l) {
        this.input.addModifyListener(modifyEvent -> l.onChange());
        return this;
    }

    @Override
    public int getLeft() {
        return this.input.getLocation().x;
    }

    @Override
    public int getRight() {
        return this.input.getLocation().x + this.input.getSize().x;
    }

    @Override
    public int getTop() {
        return this.input.getLocation().y;
    }

    @Override
    public int getBottom() {
        return this.input.getLocation().y + this.input.getSize().y;
    }
}
