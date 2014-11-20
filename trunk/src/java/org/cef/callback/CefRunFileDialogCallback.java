// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.callback;

import java.util.Vector;
import org.cef.browser.CefBrowser;

/**
 * Callback interface for CefBrowserHost::RunFileDialog. The methods of this
 * class will be called on the browser process UI thread.
 */
public interface CefRunFileDialogCallback {

  /**
   * Called asynchronously after the file dialog is dismissed. If the selection
   * was successful file_paths will be a single value or a list of values
   * depending on the dialog mode. If the selection was cancelled file_paths
   * will be empty.
   * 
   * @param browser executing browser.
   * @param filePaths list of file paths or empty list.
   */
  void onFileDialogDismissed(CefBrowser browser, Vector<String> filePaths);
}
