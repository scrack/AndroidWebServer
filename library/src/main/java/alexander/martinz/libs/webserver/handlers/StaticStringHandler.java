/*
 * Copyright 2015 Alexander Martinz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package alexander.martinz.libs.webserver.handlers;

import android.support.annotation.NonNull;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.router.RouterNanoHTTPD;

public class StaticStringHandler extends RouterNanoHTTPD.DefaultHandler {
    private static final String MIME_TYPE = "text/html";
    private String stringToReturn;

    public StaticStringHandler() {
        this.stringToReturn = "";
    }

    public StaticStringHandler(@NonNull final String stringToReturn) {
        this.stringToReturn = stringToReturn;
    }

    public void setText(@NonNull String stringToReturn) {
        this.stringToReturn = stringToReturn;
    }

    @Override public String getText() {
        return stringToReturn;
    }

    @Override public String getMimeType() {
        return MIME_TYPE;
    }

    @Override public NanoHTTPD.Response.IStatus getStatus() {
        return NanoHTTPD.Response.Status.OK;
    }
}
