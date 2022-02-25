package com.example.behavioral.template;

// tipo abstracto
public abstract class HtmlTemplate {

    public String render(){

        return String.format("""
                %s
                %s
                %s
                """, head(), body(), footer());
    }

    public abstract String head(); // parte variable implementada por los subtipos
    public abstract String body(); // parte variable implementada por los subtipos

    public String footer(){ // parte fija
        return """
                <footer>
                    Copyright 2021
                </footer> </body></html>
                """;
    }

}
