import Route from '@ember/routing/route';
import { hash } from 'rsvp';
import { alias } from '@ember/object/computed';

export default Route.extend({
  model() {
    var newSighting = this.store.createRecord('sighting');
    var cryptids = this.store.findAll('cryptid');
    var witnesses = this.store.findAll('witness');
    return hash({
      sighting: newSighting,
      cryptids: cryptids,
      witnesses: witnesses
    });
  },
  sighting: alias('controller.model.sighting'),
  actions: {
    willTransition() {
      var sighting = this.get('controller.model.sighting');
      if (sighting.get('hasDirtyAttributes')) {
        sighting.deleteRecord();
      }
    },
    create() {
      this.get('sighting').save().then(() => {
        this.send('flash', {alertType: "success", message: "New sighting."});
        this.transitionTo('sightings');
      });
    },
    cancel() {
      this.get('sighting').deleteRecord();
      this.transitionToRoute('sightings');
    }
  }
});
