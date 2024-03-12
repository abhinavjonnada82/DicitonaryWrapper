
Perform look up on the word hello:
i/p: http://localhost:8080/api/dictionary/hello

{
  "word": "hello",
  "description": "[{\"definition\":\"Used as a greeting or to begin a telephone conversation.\",\"example\":\"Hello, how are you today?\",\"synonyms\":[],\"antonyms\":[]},{\"definition\":\"Used to express a feeling of surprise.\",\"example\":\"Hello, what's all this then?\",\"synonyms\":[],\"antonyms\":[]}]"
}
------------------------------------------------------
Perform look up on a random word:
i/p: http://localhost:8080/api/dictionary/jerfnskecad
{
  "timestamp": "2023-05-18T14:25:43.294+0000",
  "status": 500,
  "error": "Internal Server Error",
  "message": "Error fetching definition for word: foobar"
}
