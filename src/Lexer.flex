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

%}

intLit = [0-9]+
intLit_cmx = [0][x|X][0-9a-fA-F]+
doubleLit = [0-9]+[.][0-9]*
doubleLit_cmx = [0-9]+[.][0-9]*[e|E][+|-]?[0-9]+
identifier = [A-Za-z_$][A-Za-z_$0-9]*
stringLit = \" ~\"
cer = [\n|\r|\n\r]

%%
// -----------------------------------------------------------rule part ------------------------------------------------
// ------------------------------------------------------Key word Token rules ------------------------------------------

int             {return token(sym.INT);}
double          {return token(sym.DOUBLE);}
void            {return token(sym.VOID);}
bool            {return token(sym.BOOL);}
string          {return token(sym.STRING);}
class           {return token(sym.CLASS);}
interface       {return token(sym.INTERFACE);}
null            {return token(sym.NULL);}
this            {return token(sym.THIS);}
extends         {return token(sym.EXTENDS);}
implements      {return token(sym.IMPLEMENTS);}
for             {return token(sym.FOR);}
while           {return token(sym.WHILE);}
if              {return token(sym.IF);}
else            {return token(sym.ELSE);}
return          {return token(sym.RETURN);}
break           {return token(sym.BREAK);}
continue        {return token(sym.CONTINUE);}
new             {return token(sym.NEW);}
NewArray        {return token(sym.NEWARRAY);}
Print           {return token(sym.PRINT);}
ReadInteger     {return token(sym.READINTEGER);}
ReadLine        {return token(sym.READLINE);}

dtoi            {return token(sym.DTOI);}
itod            {return token(sym.ITOD);}
btoi            {return token(sym.BTOI);}
itob            {return token(sym.ITOB);}
private         {return token(sym.PRIVATE);}
protected       {return token(sym.PROTECTED);}
public          {return token(sym.PUBLIC);}

// ----------------------------------------------- Keywords and boolean literals ---------------------------------------

true            {return token(sym.TRUE);}
false           {return token(sym.FALSE);}

"="             {return token(sym.ASSIGN);}
"+"             {return token(sym.PLUS);}
"-"             {return token(sym.MINUS);}
"*"             {return token(sym.TIMES);}
"/"             {return token(sym.DIVIDE);}
"%"             {return token(sym.MOD);}

">"             {return token(sym.GT);}
">="            {return token(sym.GE);}
"<"             {return token(sym.LT);}
"<="            {return token(sym.LE);}
"=="            {return token(sym.EQ);}
"!="            {return token(sym.NE);}
"!"             {return token(sym.NOT);}
"&&"            {return token(sym.AND);}
"||"            {return token(sym.OR);}

";"             {return token(sym.SEMI);}
","             {return token(sym.COMMA);}
"."             {return token(sym.DOT);}

"["             {return token(sym.LBRACK);}
"]"             {return token(sym.RBRACK);}
"("             {return token(sym.LPAREN);}
")"             {return token(sym.RPAREN);}
"{"             {return token(sym.LCURLY);}
"}"             {return token(sym.RCURLY);}

// ---------------------------------------------------- Lexer ignored rules --------------------------------------------

[" "]           {/* no operation*/}
"/*" ~"*/"      {/* no operation*/}
\/\/ ~{cer}   {/* no operation*/}
{cer}           {/* no operation*/}

//// ----------------------------------------------------String literals -----------------------------------------------

{stringLit}         {return token(sym.STRINGLIT);}

//// --------------------------------------------- Integer and double literals -----------------------------------------

{intLit_cmx}        {return token(sym.INTLIT);}
{intLit}            {return token(sym.INTLIT);}
{doubleLit_cmx}     {return token(sym.DOUBLELIT);}
{doubleLit}         {return token(sym.DOUBLELIT);}

//// ------------------------------------------------- Identifier ------------------------------------------------------

{identifier}        {return token(sym.ID);}

//to Generate lexical Scanner :
//cd src
//java -jar jflex-full-1.8.2.jar Lexer.flex
// java -jar java-cup-11b.jar DecafParser.cup