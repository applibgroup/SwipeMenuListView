/* * Copyright (C) 2021 Huawei Device Co., Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package utils;

import ohos.agp.utils.Point;

public class PointF {
    public float x;

    public float y;

    public PointF() {

    }

    public PointF(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public PointF(Point p) {
        x = p.getPointX();
        y = p.getPointY();
    }

    /**
     * Create a new PointF initialized with the values in the specified
     * PointF (which is left unmodified).
     *
     * @param p The point whose values are copied into the new
     * point.
     */
    public PointF(PointF p) {
        x = p.x;
        y = p.y;
    }

    /**
     * Set the point's x and y coordinates
     *
     * @param x
     * @param y
     */
    public final void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the point's x and y coordinates to the coordinates of p
     *
     * @param p
     */
    public final void set(PointF p) {
        x = p.x;
        y = p.y;
    }

    public final void negate() {
        x = -x;
        y = -y;
    }

    public final void offset(float dx, float dy) {
        x += dx;
        y += dy;
    }

    /**
     * Returns true if the point's coordinates equal (x,y)
     *
     * @param x
     * @param y
     * @return boolean
     */
    public final boolean equals(float x, float y) {
        return this.x == x && this.y == y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PointF pointF = (PointF) o;

        if (Float.compare(pointF.x, x) != 0) {
            return false;
        }
        if (Float.compare(pointF.y, y) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PointF(" + x + ", " + y + ")";
    }

    /**
     * Return the euclidian distance from (0,0) to the point
     *
     * @return float
     */
    public final float length() {
        return length(x, y);
    }

    /**
     * Returns the euclidian distance from (0,0) to (x,y)
     *
     * @param x
     * @param y
     * @return float
     */
    public static float length(float x, float y) {
        return (float) Math.hypot(x, y);
    }
}