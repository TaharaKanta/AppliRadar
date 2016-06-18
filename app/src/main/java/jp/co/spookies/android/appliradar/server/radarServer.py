from wsgiref import simple_server
import random
import time

positions = {}
def application(environ, start_response):
    query = environ['QUERY_STRING'].split(',')
    start_response('200 OK', [('Content-type', 'text/plain')])
    if environ['PATH_INFO'].startswith('/regist'):
        if len(query) == 3:
            id = random.randint(0, 2**31)
            while positions.has_key(id):
                id = random.randint(0, 2**31)
            positions[id] = (query[0], query[1], int(query[2]))
            return str(id)
        if len(query) == 4:
            positions[int(query[0])] = (query[1], query[2], int(query[3]))
    for id, pos in positions.items():
        if time.time()*1000 - pos[2] > 3 * 60 * 1000:
            positions.pop(id)
    return ' '.join([pos[0] + ' ' + pos[1] for pos in positions.values()])

if __name__ == '__main__':
    simple_server.make_server('', 8080, application).serve_forever()

