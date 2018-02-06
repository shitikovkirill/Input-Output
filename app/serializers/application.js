import Ember from 'ember';
import DS from 'ember-data';

let underscore = Ember.String.underscore;

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
