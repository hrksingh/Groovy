import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()

def json = ''' 
{
  "host": "localhost",
  "port": 3030,
  "public": "../public/",
  "paginate": {
    "default": 10,
    "max": 50
  },
  "mongodb": "mongodb://localhost:27017/api"
}
'''

def object = jsonSlurper.parseText(json)

object.each{ k , v ->
if(v instanceof Map){
 v.each{ x , y -> println "$k.$x : $y" }
}
else{
println "$k : $v" }
}

//println object.paginate
assert object.paginate instanceof Map

