import Route from '@ember/routing/route';
import { hash } from 'rsvp';

export default Route.extend({
  model(params) {
    var sighting = this.store.findRecord('sighting', params.sighting_id);
    var cryptids = this.store.findAll('cryptid');
    var witnesses = this.store.findAll('witness');
    return hash({
      sighting: sighting,
      cryptids: cryptids,
      witnesses: witnesses
    });
  }
});
