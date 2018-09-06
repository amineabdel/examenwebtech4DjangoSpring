from django.http import HttpResponse
from django.conf import settings
from django.template import Context, loader
#from django.shortcuts import render_to_response
from django.shortcuts import render
#from django.http import HttpResponseRedirect
from django.http import HttpResponse

def index(request):


    f = open('movies.txt', 'r')
    file_content = f.read()
    f.close()
    context= {'file_content': file_content}

    act =  request.POST.get('film', '')
    

  
    #return HttpResponse(file_content, content_type="text/plain") 
    return render(request,'index.html',context,{'act':act})
    
