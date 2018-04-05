package com.blossomproject.ui.theme;

import java.io.IOException;
import java.io.OutputStream;

public interface ThemeCompiler {

  void doCompileAll() throws Exception;

  void getCss(String theme, OutputStream os) throws IOException;

}
