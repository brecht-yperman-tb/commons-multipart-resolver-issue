# commons-multipart-resolver-issue
Sample code for Spring issue

When uploading a file to http://localhost:8080, it returns a bad request error, `Required request part 'file' is not present.`

`curl --location --request POST 'http://localhost:8080/upload' \
--header 'Content-Type: multipart/form-data; boundary=--------------------------773080340045110981114757' \
--form 'file=@/test.bin'`

The resolution is to remove the CommonsMultipartResolver bean, or to change log level for DispatcherServlet to info or higher.
