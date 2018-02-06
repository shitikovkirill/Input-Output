import { underscore } from '@ember/string';
import DS from 'ember-data';


export default DS.JSONAPISerializer.extend({
  keyForAttribute(attr){
    let returnVal = underscore(attr);
    //debugger;
    return returnVal;
  },
  keyForRelationship(rawKey){
    return underscore(rawKey);
  }
});
