# stupid-xml-parser

Build a little XML parser using the instaparse library to tokenize and
parse the XML based on a simple EBNF grammar. Here is the grammar
supported:

```
    elem      = start_tag content end_tag
    qname     = #'[a-zA-Z]+'
    text      = #'[a-zA-Z0-9 ]+'
    start_tag = <'<'> qname <'>'>
    end_tag   = <'</'> qname <'>'>
    content   = text? ((elem | text) text?)*
                text
```
--
https://github.com/cddr/stupid-xml-parser/blob/master/src/stupid_xml_parser/xml.clj#L16-L22

## Usage

Do not use.

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
