import java_cup.runtime.*;
import java.io.*;

%%

%public
%class DecafScanner
%standalone
%unicode

%type Symbol
%char
%cup


%{

public Symbol token(int tokenType){

    System.out.println(yytext());
    return new Symbol(tokenType);
}

//public Symbol token(int literal , int tokenType)
//{
//    System.out.println(yytext());
//    return new Symbol(tokenType, yytext());
//}
//
//public Symbol token(String literal , int tokenType)
//{
//    System.out.println(yytext());
//    return new Symbol(tokenType, yytext());
//}
%}

number = [0-9]+

%%
// -----------------------------------------------------------rule part -------------------------------------------------
// ------------------------------------------------------Key word Token rules ------------------------------------------

//int             {return token(sym.INT);}
//double          {return token(sym.DOUBLE);}
//void            {return token(sym.VOID);}
//bool            {return token(sym.BOOL);}
//string          {return token(sym.STRING);}
//string          {return token(sym.STRING);}
//
//class           {OutputHandler.handle(Token.T_class);}
//interface       {OutputHandler.handle(Token.T_interface);}
//null            {OutputHandler.handle(Token.T_null);}
//this            {OutputHandler.handle(Token.T_this);}
//extends         {OutputHandler.handle(Token.T_extends);}
//implements      {OutputHandler.handle(Token.T_implements);}
//for             {OutputHandler.handle(Token.T_for);}
//while           {OutputHandler.handle(Token.T_while);}
//if              {OutputHandler.handle(Token.T_if);}
//else            {OutputHandler.handle(Token.T_else);}
//return          {OutputHandler.handle(Token.T_return);}
//break           {OutputHandler.handle(Token.T_break);}
//continue        {OutputHandler.handle(Token.T_continue);}
//new             {OutputHandler.handle(Token.T_new);}
//NewArray        {OutputHandler.handle(Token.T_NewArray);}
//Print           {OutputHandler.handle(Token.T_Print);}
//ReadInteger     {OutputHandler.handle(Token.T_ReadInteger);}
//ReadLine        {OutputHandler.handle(Token.T_ReadLine);}
//dtoi            {OutputHandler.handle(Token.T_dtoi);}
//itod            {OutputHandler.handle(Token.T_itod);}
//btoi            {OutputHandler.handle(Token.T_btoi);}
//itob            {OutputHandler.handle(Token.T_itob);}
//private         {OutputHandler.handle(Token.T_private);}
//protected       {OutputHandler.handle(Token.T_protected);}
//public          {OutputHandler.handle(Token.T_public);}

// ------------------------------------------------- Keywords and boolean literals -------------------------------------

//true            {OutputHandler.handle("true", Token.T_BOOLEANLITERAL);}
//false           {OutputHandler.handle("false", Token.T_BOOLEANLITERAL);}
"="             {return token(sym.ASSIGN);}
"+"             {return token(sym.PLUS);}
"-"             {return token(sym.MINUS);}
"*"             {return token(sym.TIMES);}
"/"             {return token(sym.DIVIDE);}
"%"             {return token(sym.MOD);}
{number}        {return token(sym.NUMBER);}
//">"             {return token(sym.GT);}
//">="            {return token(sym.GE);}
//"<"             {return token(sym.LT);}
//"<="            {return token(sym.LE);}
//"=="            {return token(sym.EQ);}
//"!="            {return token(sym.NE);}
"!"             {return token(sym.NOT);}
"&&"            {return token(sym.AND);}
//"||"            {return token(sym.OR);}

";"             {return token(sym.SEMI);}
//","             {return token(sym.COMMA);}
//"."             {return token(sym.DOT);}
//
//"["             {return token(sym.LBRACK);}
//"]"             {return token(sym.RBRACK);}
//"("             {return token(sym.LPAREN);}
//")"             {return token(sym.RPAREN);}
//"{"             {return token(sym.LCURLY);}
//"}"             {return token(sym.RCURLY);}

// ------------------------------------------------------ Lexer ignored rules ------------------------------------------

//[" "]           {/* no operation*/}
//"/*" ~"*/"      {/* no operation*/}
//["//"] ~{cer}   {/* no operation*/}
//{cer}           {/* no operation*/}
//
//// ------------------------------------------------------- String literals ---------------------------------------------
//
//\" ~\"          {return token( , sym.STRLIT);}
//\" ~\"          {OutputHandler.handle(yytext(),Token.T_STRINGLITERAL);}
//
//// -------------------------------------------------- Integer and double literals --------------------------------------
//
//[0][x|X][0-9a-fA-F]+                {return token( , sym.STRLIT);}
//[0-9]+[.][0-9]*[e|E][+|-]?[0-9]+    {return token( , sym.DOBLIT);}
//[0-9]+[.][0-9]*                     {return token( , sym.DOBLIT);}
//[0-9]+                              {return token( , sym.INTLIT);}
//
//[0][x|X][0-9a-fA-F]+                {OutputHandler.handle(yytext(),Token.T_INTLITERAL);}
//[0-9]+[.][0-9]*[e|E][+|-]?[0-9]+    {OutputHandler.handle(yytext(),Token.T_DOUBLELITERAL);}
//[0-9]+[.][0-9]*                     {OutputHandler.handle(yytext(),Token.T_DOUBLELITERAL);}
//[0-9]+                              {OutputHandler.handle(yytext(),Token.T_INTLITERAL);}
//
//
//// ---------------------------------------------------------------------------------------------------------------------
//
//[A-Za-z_$][A-Za-z_$0-9]*    {return token( , sym.ID);}
//[A-Za-z_$][A-Za-z_$0-9]*    {OutputHandler.handle(yytext(),Token.T_ID);}    // rule for ID checking

//to Generate lexical Scanner :
//cd src
//java -jar jflex-full-1.8.2.jar Lexer.flex
// java -jar java-cup-11b.jar DecafParser.cup