import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')
def object2 = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')

assert object2 instanceof Map
assert object2.myList instanceof List
println object2.myList

assert object instanceof Map
println object.name