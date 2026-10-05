package com.github.barfurth.jb.plastic.annotator

import com.intellij.java.syntax.parser.JavaKeywords
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiKeyword
import com.intellij.psi.PsiLiteralExpression

class JavaSemanticColoringAnnotator : AbstractSemanticColoringAnnotator() {

  override fun isKeyword(element: PsiElement): Boolean {
    return element is PsiKeyword || element is PsiLiteralExpression
  }

  override fun getSemanticKeywords(): Map<String, SemanticTokenType> {
    return mapOf(
      JavaKeywords.TRUE to SemanticTokenType.CONSTANT,
      JavaKeywords.FALSE to SemanticTokenType.CONSTANT,
      JavaKeywords.NULL to SemanticTokenType.CONSTANT,

      JavaKeywords.CLASS to SemanticTokenType.STORAGE,
      JavaKeywords.RECORD to SemanticTokenType.STORAGE,
      JavaKeywords.INTERFACE to SemanticTokenType.STORAGE,
      JavaKeywords.ENUM to SemanticTokenType.STORAGE,
      JavaKeywords.VAR to SemanticTokenType.STORAGE,
      JavaKeywords.CONST to SemanticTokenType.STORAGE,

      JavaKeywords.CHAR to SemanticTokenType.TYPE,
      JavaKeywords.BOOLEAN to SemanticTokenType.TYPE,
      JavaKeywords.LONG to SemanticTokenType.TYPE,
      JavaKeywords.FLOAT to SemanticTokenType.TYPE,
      JavaKeywords.INT to SemanticTokenType.TYPE,
      JavaKeywords.BYTE to SemanticTokenType.TYPE,
      JavaKeywords.SHORT to SemanticTokenType.TYPE,
      JavaKeywords.DOUBLE to SemanticTokenType.TYPE,
      JavaKeywords.VOID to SemanticTokenType.TYPE,
    )
  }

}
