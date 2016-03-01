(ns stupid-xml-parser.xml
  "Stupid XML parser to learn instaparse. Do not use"
  (:require
   [instaparse.core :refer [parser]]))

(def xml
  "Parses the XML string `s`. The following
   concepts are supported.

    simple element <foo>foo</foo>
    nested element <foo>
                     <bar>bar</bar>
                   </foo>
   "
  (parser
   "elem      = start_tag content <end_tag>
    qname     = #'[a-zA-Z]+'
    text      = #'[a-zA-Z0-9 ]+'
    start_tag = <'<'> qname <'>'>
    end_tag   = <'</'> qname <'>'>
    content   = text? ((elem | text) text?)*
                text "))

(xml "<foo>blah blah<nested>haha</nested>blah 1234</foo>")
