/*
 * AppOpsXposed - AppOps for Android 4.3+
 * Copyright (C) 2013 Joseph C. Lehner
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of  MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package at.jclehner.appopsxposed.variants;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;

import at.jclehner.appopsxposed.util.Util;

public class OmniROM extends Minimal {
    public OmniROM(SharedPreferences prefs) {
        super(prefs);
    }

    @Override
    protected boolean onMatch(ApplicationInfo appInfo, ClassChecker classChecker) {
        return !Util.getSystemProperty("ro.omni.version", "").isEmpty();
    }
}
