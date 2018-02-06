import { helper } from '@ember/component/helper';
import Ember from 'ember';

export function momentFrom(params/*, hash*/) {
  var time = window.moment(...params);
  var formatted = time.fromNow();
  return new Ember.Handlebars.SafeString('<span class="text-primary">' + formatted + '</span>');
}

export default helper(momentFrom);
