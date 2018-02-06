import Controller from '@ember/controller';
import { alias } from '@ember/object/computed';

export default Controller.extend({
  sighting: alias('model.sighting'),
  actions: {
    update() {
      if (this.get('sighting').get('hasDirtyAttributes')) {
        this.get('sighting').save().then(() => {
          this.transitionToRoute('sightings');
        });
      }
    },
    cancel() {
      if (this.get('sighting').get('hasDirtyAttributes')) {
        this.get('sighting').rollbackAttributes();
      }
      this.transitionToRoute('sightings');
    },
    delete() {
      if (window.confirm("Are you sure you want to delete this sighting?")) {
        this.get('sighting').destroyRecord().then(() => {
          // transitions to sightings;
          this.transitionToRoute('sightings');
        });
      }
    }
  }
});
