patterns: 
  $text1 = lorem ipsum
  $text2 = dolor sit amet


theme: /

    state: NoMatch
        event!: noMatch
        script:
            var res = $nlp.matchPatterns("lorem ipsum", ["$text1", "$text2"]);
            log(res);
