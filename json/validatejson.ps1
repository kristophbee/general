#load json
$json=Get-Content "data.json" | ConvertFrom-Json -Depth 22
Write-Output($json)
#convert to json again
$jsonobj = $json | ConvertTo-Json -Depth 22
#load schema
$schemaFile = (Get-ChildItem -Path "schema.json").FullName
#test json via schema
$result = $jsonobj | Test-Json -SchemaFile $schemaFile
if ($result){
    #happy path, data matches the schema
    Write-Output("All good, a perfect match!")
} else {
    #In case of any mismatches the data will be printed here
    $result
}