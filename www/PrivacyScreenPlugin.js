/**
 * Updated by Patrícia Ferreira on 14/08/2020
 */

var exec = require('cordova/exec');

var PLUGIN_NAME = 'PrivacySecurePlugin';

/**
* Methods only required for Android
*/

exports.addFlag = function(success, error) {
    exec(success, error, PLUGIN_NAME, "addFlag", []);
};

exports.removeFlag = function(success, error) {
    exec(success, error, PLUGIN_NAME, "removeFlag", []);
};