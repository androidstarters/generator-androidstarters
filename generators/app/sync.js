const each = require('async-each');
const jsonfile = require('jsonfile');
const yeomanSync = require('yeoman-sync');

let configs = jsonfile.readFileSync('./templates.json');

each(configs, yeomanSync, function () {
  console.log('Contents for a, b and c:');
});
