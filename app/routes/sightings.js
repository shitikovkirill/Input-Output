import Route from '@ember/routing/route';

export default Route.extend({
  model() {
    let record1 = {
      location: 'Atlanta',
      sightedAt: new Date('2012-10-24')
    };
    let record2 = {
      location: 'Calloway',
      sightedAt: new Date('2012-09-24')
    };
    let record3 = {
      location: 'Asilomar',
      sightedAt: new Date('2012-12-24')
    };
    return [record1, record2, record3];
  }
});
