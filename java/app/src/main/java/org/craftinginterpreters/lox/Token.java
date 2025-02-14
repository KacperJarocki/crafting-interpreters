package org.craftinginterpreters.lox;

class Token {
  final TokenType type;
  final String lexeme;
  final Object literal;
  final int line;

  Token(TokenType type, String lexeme, Object literal, int line) {
    this.line = line;
    this.lexeme = lexeme;
    this.literal = literal;
    this.type = type;
  }

  public String toString() {
    return type + " " + lexeme + " " + literal;
  }
}
