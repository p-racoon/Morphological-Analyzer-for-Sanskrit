# Morphological-Analyzer-for-Sanskrit
BY- PRASHAM ASHESH
    AYUSH TRIVEDI
    MANU DANDOTIYA

Special thanks to our mentor- Mrs.Ambalika Sarkar

for its website implementation in JSP visit:-
https://github.com/imayu/sanskrit-compiler-website


About the project:-
This was my minor project for 3rd Year, this repository holds three java packages namely performanceCheck, parser1 and parser2.

Project Report.pdf and Project Synopsis.pdf could come in handy and will help you further to understand this project.
Even with my best efforts, bugs might have crept in, it will be great help if you could help me to find any.

NOTE:the example used by me in this program "पठः पन् कथ" is syntactically correct but its senseless, this is what 
this project lacks a database for dhaatus, it would be great if you could suggest me some ideas, I will surely work on
it too, but its not going to be sometime soon.

About parser1:-
parser1 has 13 .java files of which Verb.java holds the parent class Verb which implicitally calls its
sub classes.Structure is as follows:-
Verb-
    VPast
      VPaFirstPerson
      VPaSecondPerson
      VPaThirdPerson
    VPresent
      VPrFirstPerson
      VPrSecondPerson
      VPrThirdPerson
    VFuture
      VFuFirstPerson
      VFuSecondPerson
      VFuThirdPerson

I was not able to implement Top Down Recursive Parser for Nouns because midway through the project I realized that
implementing Sanskrit Morphological Structure using a Finite Automata was much more efficient than Top Down Recursive Parser.
So I shifted my focus towards implementing a DFA for it.

About parser2:-
parser2 has 19 .java files of which SanskritParser1.java is of utmost importance, since its from here that you will be able to
pull of functions like PadParichay,Word PadParichay, and Grammer Checking tool.Structure is as follows:-
SanskritParser1-
    NounDFA1
      Nstate0
        NMFState0
          NMFState1
          NMFState2
          NMFState3
        
        NNState0
          NNState1
          NNState2
    
    VerbDFA
      Vstate0
        Vstate1
        Vstate2
        Vstate3
        Vstate4
        Vstate5
        Vstate6
        Vstate7

All the classes with name state0 in it are Start states, the next lvl of states mentioned under them are only the first
level of DFA, rest levels are handled within these classes, you will need to refer to the DFA that I used, you simply won't
be able to get a sense of it if you don't keep that DFA handy with you(Note:"STATE NUMBERS" used in the DFA reference are not 
the same as used by me, so dont get confused)
(SPECIAL THANKS TO AYUSH TRIVEDI FOR HELPING ME OUT IN DIGITALIZING THE DFA, MAKING IT PRESENTABLE)

About performanceCheck:-
    PerformanceChecker
A simple delay check comparision between Top Down Recursive Technique and Finite State Automata.


HOW TO RUN IT:-
Dont try running it simply by using Command Prompt its of no use, since by default you wont be able to input a Devanagri text
using cmd. For this project I used Eclipse and I would recommend you do the same. Refer to EclipseHindiHelp.jpg and the following link
http://stackoverflow.com/questions/10814692/spanish-language-chars-are-not-displayed-properly/10815108#10815108 to make eclipse hindi 
compatible, and needless to mention use UTF-8 format to store all the files that include use of sanskrit or hindi text. 

Place the packages next to the .java file you intend to use it in and then:--
For analyzing a Sanskrit Verb:-
import parser1.*;
    //create an object of Verb
    yourFunction(String inputWord){
      Verb ob=new Verb();
      String result=ob.start(inputWord);
      System.out.println(result);
      }

For using Grammer check:-
import parser2.*;
    //create an object of SanskritParser1
    yourFunction(String inputSentence){
      SanskritParser1 ob=new  SanskritParser1();
      String result=ob.startSanskritParser1(inputSentence);
      System.out.println(result);
      }

For using Sentence Pad Parichay :-
import parser2.*;
    //create an object of SanskritParser1
    yourFunction(String inputSentence){
      SanskritParser1 ob=new  SanskritParser1();
      String result=ob.startSentencePadParichay(inputSentence);
      System.out.println(result);
      }

For using Word Pad Parichay :-
import parser2.*;
    //create an object of SanskritParser1
    yourFunction(String inputWord){
      SanskritParser1 ob=new  SanskritParser1();
      String result=ob.startWordPadParichay(inputWord);
      System.out.println(result);
      }

Performance Checker/ Comparision between TopDown Recursive technique an DFA:- 
//DO NOT FORGET TO PUT THE parser1 AND parser2 PACKAGES NEXT TO THIS PACKAGE
import performanceCheck.*;
    //create an object of PerformanceChecker
    yourFunction(String inputWord){
      PerformanceChecker obj=new PerformanceChecker();
      String result=ob.startPerformanceChecker(String inputWord);
      System.out.println(result);
      }
