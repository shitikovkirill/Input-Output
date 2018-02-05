export default function () {
  this.namespace = 'api';

  this.get('/sightings', function () {
    return {
      data: [{
        type: 'sighting',
        id: 'grand-old-mansion',
        attributes: {
          location: 'Atlanta',
          sightedAt: new Date('2012-10-24')
        }
      }, {
        type: 'sighting',
        id: 'urban-living',
        attributes: {
          location: 'Calloway',
          sightedAt: new Date('2012-09-24')
        }
      }, {
        type: 'sighting',
        id: 'downtown-charm',
        attributes: {
          location: 'Asilomar',
          sightedAt: new Date('2012-12-24')
        }
      }]
    };
  }),

    this.get('/witnesses', function () {
      return {
        data: [{
          type: 'witness',
          id: '1',
          attributes: {
            'f-name': "Todd",
            'l-name': "Gandee",
            email: "test@gmail.com"
          }
        },
          {
            type: 'witness',
            id: '2',
            attributes: {
              'f-name': "Nekit",
              'l-name': "Shitikov",
              email: "nekit@gmail.com"
            }
          }]
      }
    }),
    this.get('/cryptids', function () {
      return {
        data: [{
          type: 'cryptid',
          id: '1',
          attributes: {
            'name': "Chudo",
            'cryptid-type': "middle",
            'profile-img': "img1"
          }
        },
          {
            type: 'cryptid',
            id: '2',
            attributes: {
              'name': "Texx",
              'cryptid-type': "middle",
              'profile-img': "img2"
            }
          }
        ]
      }
    })
}
