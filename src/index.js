'use strict';
var Scatter = require('lightning-scatter');
var _ = require('lodash');

/*
 * Extend the scatter visualization with a new append
 */
var Visualization = Scatter.extend({

    getDefaultOptions: function() {
        return {
            brush: false,
            tooltips: false,
            zoom: true
        }
    },

    appendData: function(formattedData) {  
        this.data.points = _.filter(this.data.points, function(d) {return d.a != 0.1})
        this.data.points = _.map(this.data.points, function(d) {
            if (d.a == 0.9) {
                d.a = 0.5
            } else if (d.a == 0.5) {
                d.a = 0.1
            }
            return d
        })
        this.data.points = this.data.points.concat(formattedData.points)
        this.redraw() 
    }

});

module.exports = Visualization;
